package controllers

import play.api.mvc._
import play.api.routing.JavaScriptReverseRouter


class JsController extends Controller{
  def javascriptRoutes = Action { implicit request =>
    Ok(
      JavaScriptReverseRouter("jsRoutes")(
        routes.javascript.CountController.count,
        routes.javascript.HomeController.index,
        routes.javascript.HomeController.signup1,
        routes.javascript.HomeController.login1,
        routes.javascript.SignupController.processData,
        routes.javascript.LoginController.loginProcess
      )
    ).as("text/javascript")
  }

}
