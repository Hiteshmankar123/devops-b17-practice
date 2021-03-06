pipelineJob('scripted-pipeline_converted') {

  description('')

  displayName('scripted-3')

  configure { flowdefinition ->

    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps@2725.v7b_c717eb_12ce') {

      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {

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
 