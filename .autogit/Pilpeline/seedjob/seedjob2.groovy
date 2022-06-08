pipelineJob('scripted-2') {

  description('')

  displayName('scripted-2'

  configure { flowdefinition ->

    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps@2725.v7b_c717eb_12ce') {

      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git@4.11.3') {

        'configVersion'(2)

        'userRemoteConfigs' {

          'hudson.plugins.git.UserRemoteConfig' {

            'url'('https://github.com/Hiteshmankar123/devops-b17-practice.git')

            'credentialsId'('github-user-pass')

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

      'lightweight'(false)

    }

  }

}

cat: cat: No such file or directory
pipelineJob('scripted-pipeline_converted') {

  description('')

  displayName('scripted-pipeline_converted')

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

            'credentialsId'('github-user-pass')

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

      'lightweight'(false)

    }

  }

}

[root@ip-172-31-17-104 jobs]# cat scripted-pipeline.groovy cat scripted-pipeline.groovy | less
cat: cat: No such file or directory

        'userRemoteConfigs' {

          'hudson.plugins.git.UserRemoteConfig' {

            'url'('https://github.com/Hiteshmankar123/devops-b17-practice.git')

            'credentialsId'('github-user-pass')

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

      'lightweight'(false)

    }

  }

}

