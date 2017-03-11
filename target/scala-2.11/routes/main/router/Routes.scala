
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Play/newAjax/conf/routes
// @DATE:Sat Mar 11 12:24:01 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_5: controllers.Assets,
  // @LINE:15
  JsController_4: controllers.JsController,
  // @LINE:21
  SignupController_2: controllers.SignupController,
  // @LINE:23
  LoginController_6: controllers.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_5: controllers.Assets,
    // @LINE:15
    JsController_4: controllers.JsController,
    // @LINE:21
    SignupController_2: controllers.SignupController,
    // @LINE:23
    LoginController_6: controllers.LoginController
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_3, Assets_5, JsController_4, SignupController_2, LoginController_6, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_3, Assets_5, JsController_4, SignupController_2, LoginController_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """javascriptRoutes""", """controllers.JsController.javascriptRoutes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signuptoprofile/""", """controllers.SignupController.processData(firstname:String, middlename:String, lastname:String, username:String, pwd:String, repwd:String, mobileNo:String, gender:String, age:String, hobbies:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logintoprofile/""", """controllers.LoginController.loginProcess(username:String, pwd:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_home0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_home0_invoker = createInvoker(
    HomeController_1.home,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "home",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_JsController_javascriptRoutes4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("javascriptRoutes")))
  )
  private[this] lazy val controllers_JsController_javascriptRoutes4_invoker = createInvoker(
    JsController_4.javascriptRoutes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JsController",
      "javascriptRoutes",
      Nil,
      "GET",
      """""",
      this.prefix + """javascriptRoutes"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_signup5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup5_invoker = createInvoker(
    HomeController_1.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_login6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login6_invoker = createInvoker(
    HomeController_1.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_SignupController_processData7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signuptoprofile/")))
  )
  private[this] lazy val controllers_SignupController_processData7_invoker = createInvoker(
    SignupController_2.processData(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignupController",
      "processData",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """signuptoprofile/"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_LoginController_loginProcess8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logintoprofile/")))
  )
  private[this] lazy val controllers_LoginController_loginProcess8_invoker = createInvoker(
    LoginController_6.loginProcess(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginProcess",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """logintoprofile/"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_home0_route(params) =>
      call { 
        controllers_HomeController_home0_invoker.call(HomeController_1.home)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_JsController_javascriptRoutes4_route(params) =>
      call { 
        controllers_JsController_javascriptRoutes4_invoker.call(JsController_4.javascriptRoutes)
      }
  
    // @LINE:17
    case controllers_HomeController_signup5_route(params) =>
      call { 
        controllers_HomeController_signup5_invoker.call(HomeController_1.signup)
      }
  
    // @LINE:19
    case controllers_HomeController_login6_route(params) =>
      call { 
        controllers_HomeController_login6_invoker.call(HomeController_1.login)
      }
  
    // @LINE:21
    case controllers_SignupController_processData7_route(params) =>
      call(params.fromQuery[String]("firstname", None), params.fromQuery[String]("middlename", None), params.fromQuery[String]("lastname", None), params.fromQuery[String]("username", None), params.fromQuery[String]("pwd", None), params.fromQuery[String]("repwd", None), params.fromQuery[String]("mobileNo", None), params.fromQuery[String]("gender", None), params.fromQuery[String]("age", None), params.fromQuery[String]("hobbies", None)) { (firstname, middlename, lastname, username, pwd, repwd, mobileNo, gender, age, hobbies) =>
        controllers_SignupController_processData7_invoker.call(SignupController_2.processData(firstname, middlename, lastname, username, pwd, repwd, mobileNo, gender, age, hobbies))
      }
  
    // @LINE:23
    case controllers_LoginController_loginProcess8_route(params) =>
      call(params.fromQuery[String]("username", None), params.fromQuery[String]("pwd", None)) { (username, pwd) =>
        controllers_LoginController_loginProcess8_invoker.call(LoginController_6.loginProcess(username, pwd))
      }
  }
}
