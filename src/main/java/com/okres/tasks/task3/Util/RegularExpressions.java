package com.okres.tasks.task3.Util;

public interface RegularExpressions {
    String FIRST_NAME = "/\b([A-Z]{1}[a-z]{1,30}[- ]{0,1}|[A-Z]{1}[- \']{1}[A-Z]{0,1} [a-z]{1,30}" +
            "[- ]{0,1}|[a-z]{1,2}[ -\']{1}[A-Z]{1}[a-z]{1,30}){2,5}/";
}
