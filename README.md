# Example sbt project that demos code coverage in Scala 3

## Usage

Currently in order to test this you'll need [this branch of Dotty](https://github.com/ckipp01/dotty/tree/coverage).

There is an sbt alias that you're able to use, `testCoverage` which will turn on
coverage, run the tests, and generate your report. You'll then be able to find
the report in
`./target/scala-3.1.2-RC1-bin-SNAPSHOT/scoverage-report/index.html`.

## Under the hood.

This is using `sbt-scoverage` v2.0.0-M1 which will correctly set the `-coverage`
flag for your project when you turn coverage on, and also pass in the output
dir. You can see if if you open sbt and do a `coverge` followed by a `show
Compile / compile / scalacOptions`.

