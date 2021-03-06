/**
 * Created by tdongsi on 1/4/18.
 */

def call(Map params = [:]) {
    String script = params.script
    Boolean returnStatus = params.get('returnStatus', false)
    Boolean returnStdout = params.get('returnStdout', false)
    String encoding = params.get('encoding', null)

    timeout(5) {
        return steps.sh(script: script,
                returnStatus: returnStatus,
                returnStdout: returnStdout,
                encoding: encoding)
    }

}

/* Convenience overload */
def call(String script) {
    return call(script: script)
}