package com.fintechlabs

import java.util.regex.Matcher
import java.util.regex.Pattern

class HelperTagLib {

    static namespace = "helperTG"

    private final static Pattern OFFSET_PATTERN = Pattern.compile("offset=(\\d+)")

    def paginate = { attrs, body ->
        String str = g.paginate(attrs) // using grails gsp paginate tag
        // make sure we delete max param with & (before or after)
        str = str.replaceAll(/&amp;max=\d+/, '').replaceAll(/max=\d+&amp;/, '')
        while (true) {
            Matcher matcher = OFFSET_PATTERN.matcher(str)
            if (matcher.find()) {
                long pageNum = (matcher.group(1) as long) / params.long('max') + 1
                // replace offset=0 with page=1, offset=30 with page=2, etc
                str = matcher.replaceFirst('page=' + pageNum)
            } else {
                break
            }
        }
        out << str
    }

}
