
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Play/newAjax/conf/routes
// @DATE:Sat Mar 11 12:24:01 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
