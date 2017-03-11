
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Play/newAjax/conf/routes
// @DATE:Sat Mar 11 12:24:01 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseJsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def javascriptRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JsController.javascriptRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "javascriptRoutes"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseSignupController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def processData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignupController.processData",
      """
        function(firstname0,middlename1,lastname2,username3,pwd4,repwd5,mobileNo6,gender7,age8,hobbies9) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signuptoprofile/" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("firstname", firstname0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("middlename", middlename1), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("lastname", lastname2), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username3), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pwd", pwd4), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("repwd", repwd5), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("mobileNo", mobileNo6), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("gender", gender7), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("age", age8), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("hobbies", hobbies9)])})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:17
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:19
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def loginProcess: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginProcess",
      """
        function(username0,pwd1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logintoprofile/" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pwd", pwd1)])})
        }
      """
    )
  
  }


}
