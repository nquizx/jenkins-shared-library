def call(String name, String branch) {
  sh(
    label: 'Echo from helloWorld.groovy',
    script: "echo \"Hello ${name} World at ${branch}\""
  )
}
