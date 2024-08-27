// vars/utils.groovy
def call() {
    return sh(script: 'date "+%Y%m%d"', returnStdout: true).trim()
}
