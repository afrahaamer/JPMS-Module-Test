module hello.modules {
exports com.afrah.modules.hello;
provides com.afrah.modules.hello.HelloInterface with com.afrah.modules.hello.HelloModules;
}