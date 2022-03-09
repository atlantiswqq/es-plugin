package com.github.atlantiswqq.esplugin.services

import com.intellij.openapi.project.Project
import com.github.atlantiswqq.esplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
