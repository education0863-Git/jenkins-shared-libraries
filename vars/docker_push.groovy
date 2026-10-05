def call(String Project, Sting ImageTag ,String DockerHubUser){
 withCredentials([usernamePassword(credentialsId: 'dockerhubcred', passwordVariable: "dockerHubPass", usernameVariable: "dockerHubUser")])
  {
    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  }
    sh "docker push ${env.dockerHubUser}/${Project}:${ImageTag}"
}
