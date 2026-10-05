def call(String repoUrl, String branchName) {
    echo "This is cloning the code"
    checkout([
        $class: 'GitSCM', 
        branches: [[name: "${branchName}"]], 
        userRemoteConfigs: [[url: "${repoUrl}"]]
    ])
    echo "code clone successfully"
}
