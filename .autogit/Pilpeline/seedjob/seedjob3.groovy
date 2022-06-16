pipelineJob('scripted-pipeline_converted') {

  description('')

  displayName('scripted-3')

  keepDependencies(false)

  quietPeriod(0)

  checkoutRetryCount(0)

  disabled(false)

  concurrentBuild(false)

  configure { flowdefinition ->

    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps@2725.v7b_c717eb_12ce') {

      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git@4.11.3') {

        'configVersion'(2)

        'userRemoteConfigs' {

          'hudson.plugins.git.UserRemoteConfig' {

            'url'('https://github.com/Hiteshmankar123/devops-b17-practice.git')

            'credentialsId'('hitesh-cred')

          }

        }

        'branches' {

          'hudson.plugins.git.BranchSpec' {

            'name'('*/master')

          }

        }

        'doGenerateSubmoduleConfigurations'(false)

        'submoduleCfg'(class:'empty-list')

        'extensions'()

      }

      'scriptPath'('.autogit/Pilpeline/scriptedPipeline.groovy')

      'lightweight'(true)

    }

  }

}
