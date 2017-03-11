
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Play/newAjax/conf/routes
// @DATE:Sat Mar 11 12:24:01 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:15
  class ReverseJsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def javascriptRoutes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "javascriptRoutes")
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:21
  class ReverseSignupController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def processData(firstname:String, middlename:String, lastname:String, username:String, pwd:String, repwd:String, mobileNo:String, gender:String, age:String, hobbies:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "signuptoprofile/" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("firstname", firstname)), Some(implicitly[QueryStringBindable[String]].unbind("middlename", middlename)), Some(implicitly[QueryStringBindable[String]].unbind("lastname", lastname)), Some(implicitly[QueryStringBindable[String]].unbind("username", username)), Some(implicitly[QueryStringBindable[String]].unbind("pwd", pwd)), Some(implicitly[QueryStringBindable[String]].unbind("repwd", repwd)), Some(implicitly[QueryStringBindable[String]].unbind("mobileNo", mobileNo)), Some(implicitly[QueryStringBindable[String]].unbind("gender", gender)), Some(implicitly[QueryStringBindable[String]].unbind("age", age)), Some(implicitly[QueryStringBindable[String]].unbind("hobbies", hobbies)))))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def home(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:17
    def signup(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:19
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:23
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def loginProcess(username:String, pwd:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logintoprofile/" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("username", username)), Some(implicitly[QueryStringBindable[String]].unbind("pwd", pwd)))))
    }
  
  }


}
