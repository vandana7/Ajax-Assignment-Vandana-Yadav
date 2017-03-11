package controllers
import javax.inject.Inject


import play.api.mvc._
import model.LoginAccount
import services.CacheHandling

class LoginController @Inject()(cache:CacheHandling) extends Controller{

  def loginProcess(username:String,pwd:String) = Action { implicit request =>

        val data = LoginAccount(username,pwd)
        val datafromcache = cache.fetchedData(cache.fetchDataFromCache(data.username))
        if(datafromcache.username == data.username && datafromcache.pwd == data.pwd) {
            Ok(views.html.profilePage(datafromcache))
          }
          else {
          Ok(views.html.profilePage(datafromcache))
          }


      }




}
