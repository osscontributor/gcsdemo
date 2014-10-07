package demo

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class DemoController {

    def actionOne() {
        render 'some text'
    }

    def actionTwo() {
        render view: 'someView', model: [some:'data']
    }
}
