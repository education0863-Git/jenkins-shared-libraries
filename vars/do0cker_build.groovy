def call(String ProjectName, Sting ImageTag ,String DockerHubUser){
  sh  "docker build -t ${DockerhubUser}/${ProjectNmae}: ${IamgeTag}."
}
