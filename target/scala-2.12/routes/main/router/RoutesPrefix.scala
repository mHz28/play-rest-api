// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ekwong/Downloads/tmp/play-rest-api/conf/routes
// @DATE:Thu Jun 07 10:20:54 PDT 2018


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
