def call(String Project, Sting ImageTag ,String DockerHubUser){
 withCredentials([usernamePassword(credentialsId: 'dockerhubcred', passwordVariable: "dockerHubPass", usernameVariable: "dockerHubUser")])
  {
    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  }
  sh "docker tag notes-app:latest ${env.dockerHubUser}/notes-app:latest"
    sh "docker push ${env.dockerHubUser}/${Project}:${ImageTag}"
}
