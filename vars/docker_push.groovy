def call(String dockerImage) {
    echo "Pushing Docker image: ${dockerImage}"
    sh "docker push ${dockerImage}"
    echo "Docker push completed successfully"
}
