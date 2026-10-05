def call() {
    echo "Building the Docker image..."
    sh "docker build -t my-django-app ."
    echo "Docker build completed successfully"
}
