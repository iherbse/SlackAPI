package com.tistory.dlsks.slack.api.validation;

/**
 * Created by Inhwan on 16. 4. 7..
 * Email : iherbse@gmail.com
 */
public class SlackValidator {
    private static final String HEX_REGEX = "^([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
    private static final String PREDEFINED_COLOR_REGEX = "^(good|warning|danger)$";

    public static boolean validChannelName(String name) throws SlackException{
        if (name == null || name.trim().length() == 0) {
            throw new SlackException("채널명 : [" + name + "] null이거나 내용이 없어요");
        }
        return true;
    }

    public static void validUrl(String url) throws SlackException {
        if (url == null || !url.startsWith("http")) {
            throw new SlackException("URL명 : [" + url + "] null이거나 http/https 로 시작하지 않아요");
        }
    }

    public static void validEmoji(String icon_emoji) {
        if (icon_emoji != null && (!icon_emoji.startsWith(":") || !icon_emoji.endsWith(":"))) {
            throw new SlackException("[" + icon_emoji + "] 이모티콘 명령어는 :emoji: 이렇게 생긴거에요");
        }
    }

    public static void validColor(String color) throws SlackException{
        if (color != null) {
            if (color.charAt(0) == '#') {
                if (!color.substring(1).matches(HEX_REGEX)) {
                    throw new SlackException("[" + color + "] 16진수가 아니에요");
                }
            } else if (!color.matches(PREDEFINED_COLOR_REGEX)) {
                throw new SlackException("[" + color + "] 색상 예약어는 good|warning|danger 에요");
            }
        }
    }
}