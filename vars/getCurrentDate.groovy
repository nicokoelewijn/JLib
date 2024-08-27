// vars/utils.groovy
def getCurrentDate() {
    return sh(script: 'date "+%Y%m%d"', returnStdout: true).trim()
}
