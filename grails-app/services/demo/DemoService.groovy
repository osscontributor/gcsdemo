package demo

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class DemoService {

    def serviceMethod() {
        log.debug "Some Message"
    }
}
