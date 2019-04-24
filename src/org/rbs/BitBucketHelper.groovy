
// println "hello" //Print Hello line

def checkOut() {
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'githubamit', url: 'https://github.com/Amitrhce/Jenkins-shared-library.git']]])
}



