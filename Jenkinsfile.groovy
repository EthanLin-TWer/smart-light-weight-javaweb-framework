node () {
    stage 'Run tests'
    env.PATH = "${tool 'Maven 3'}/bin:${env.PATH}"
    sh 'mvn test'
}