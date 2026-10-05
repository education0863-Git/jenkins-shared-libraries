def call(String appName, String tag, String dockerImage) {
    echo "Building Docker image: ${dockerImage}"
    sh "docker build -t ${dockerImage} ."
    echo "Docker build completed successfully"
}
