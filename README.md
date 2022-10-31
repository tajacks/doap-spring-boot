# SpringBoot on Digital Ocean App Platform
Sample SpringBoot web application configured to run on Digital Oceans 'App Platform'

[![Deploy to DO](https://www.deploytodo.com/do-btn-blue.svg)](https://cloud.digitalocean.com/apps/new?repo=https://github.com/tajacks/doap-spring-boot/tree/main&refcode=b188b09a9931)


### Overview
This is a sample application to serve as a base for deploying a SpringBoot app to Digital Ocean's 'App Platform'. This application
responds to basic HTTPS GET requests to `/greeting` with a random greeting.

This application is preconfigured to use the smallest possible app platform container, which at time of writing, is $5 a month.

The following is configured as part of this template:

1. Deployment failing alerts
2. Toronto location
3. Auto-build & deploy on new main branch commits
4. HTTP Health Monitor against our greeting controller
5. Build & Deploy via two-step Dockerfile

A custom domain is not included in the template, but can easily be configured after. 

To understand the full configuration, please refer to the Digital Ocean [App Spec Reference](https://docs.digitalocean.com/products/app-platform/reference/app-spec/).

You can see an example of this running at <a href="https://greeting.tajacks.com/greeting" target="_blank">greeting.tajacks.com/greeting</a>

