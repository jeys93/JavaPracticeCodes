package com.example.java;

public class Arrays {
    public static void main (String[] input) {
       /* for(int i=0;i< input.length;i++){
            input[i] = input[i].toUpperCase();
            System.out.println(i);
        } */
        System.out.println("Hi");
    }

    public static class Constants {
            public static final String NE_MODEL = "SDL_Netconf_CLI";
            public static final String NE_VENDOR = "Nokia";

            public static final String NOKIA_PROMPT_HANDLE = "PS1='nokia>'";
            public static final String NOKIA = "nokia>";
            public static final String INITIAL_PROMPT_PATTERN = "~\\]\\$\\s*$";
            public static final String NOKIA_PROMPT_CHANGE_PATTERN = "'nokia>'\\s+nokia>$";
            public static final String ENTER = "\n";
            public static final String NOKIA_LAST_PROMPT = "nokia>$";
            public static final String EXIT = "exit";
            public static final String LOGOUT = "logout";
            public static final String PASSWORD_MASK = "########";
            public static final String USER_PASSWORD_PROMPT = "(?i)password\\:\\s*$";
            public static final String VM_USERNAME_PROMPT = "(?i)Please\\s*Enter\\s*UserName\\s*\\:\\s*$";
            public static final String VM_PASSWORD_PROMPT = "(?i)Please\\s*Enter\\s*Password\\s*\\:\\s*$";
            public static final String YES_NO_PROMPT = "(?i)\\(\\s*yes\\s*\\/\\s*no\\s*\\)\\s*\\?\\s*$";
            public static final String YES_NO_PROMPT__VM_USERNAME_PROMPT = "((?i)\\(\\s*yes\\s*\\/\\s*no\\s*\\)\\s*\\?\\s*$)|((?i)Please\\s*Enter\\s*UserName\\s*\\:\\s*$)";
            //public static final String INITIAL_PROMPT = "\\$$|\\$ $|#$|# $| ~\\> $|\\[m$";
            public static final String INITIAL_PROMPT = "~\\]\\$";
            public static final String OAM_CLI_PROMPT="\\d+>\\s*$";
            //public static final String NOKIA="n";
            public static final String SENSITIVE_DATA = "(?<=\\\"snmp_priv_passwd\\\":\\\")([^\\\"]*)(?=\\\")\"|(?<=\"snmp_priv_passwd\":\")([^\"]*)(?=\")";

            public static final String SUDO_PASSWORD_PROMPT = "\\s*\\[sudo\\]\\s+password\\s+for\\s+gstool\\s*:$";

            public final static int WAIT_TIMEOUT = 30000;

        }
}