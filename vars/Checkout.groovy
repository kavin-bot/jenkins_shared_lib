def call(Map stageparams){
    Checkout([
        $class: 'GitSCM',
        branches: [[name: stageparams.branch]],
        useRemoteConfigs: [[url:stageparams.url]]
        ])
    }
