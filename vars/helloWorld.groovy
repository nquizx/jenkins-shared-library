def call() {
  sh(
    label: 'Echo from helloWorld.groovy',
    script: 'echo "Hello World"'
  )
}
