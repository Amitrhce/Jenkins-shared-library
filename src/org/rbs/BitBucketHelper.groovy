
// println "hello" //Print Hello line
// def some_func(){
//  println test.my_global
// }

 def checkOut(repo) {
  checkout([$class: 'GitSCM', branches: [[name: '/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'githubamit', url: 'https://github.com/Amitrhce/Jenkins-shared-library.git']]])
  println "check out from amit git repos"
  return this
 
  } 
