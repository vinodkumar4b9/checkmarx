def code

node() {
  stage('Checkout') {
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/vinodkumar4b9/checkmarx.git']]])
  }

  stage('Load') {
    code = load 'post.groovy'
  }

  stage('Execute') {
   
      {
      sh "echo vinodkumar"
      def bodyText = code.getPrBody()
      

    }
  }
}
