def call(Map stageparams){
    checkout([
        $class: 'GitSCM',
        branches: [[name: stageparams.branch]],
        useRemoteConfigs: [[url:stageparams.url]]
        ])
    }
