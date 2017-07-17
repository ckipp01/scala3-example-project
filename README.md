# Example sbt project that compiles using Dotty

[![Build Status](https://travis-ci.org/lampepfl/dotty-example-project.svg?branch=master)](https://travis-ci.org/lampepfl/dotty-example-project)

## Usage

This is a normal sbt project, you can compile code with `sbt compile` and run it
with `sbt run`, `sbt console` will start a Dotty REPL.

If compiling this example project fails, you probably have a global sbt plugin
that does not work with dotty, try to disable all plugins in
`~/.sbt/0.13/plugins` and `~/.sbt/0.13`.

## Template projects
The fastest way to start a new Dotty project is to use one of the following templates:
* [Simple Dotty project](https://github.com/lampepfl/dotty.g8)
* [Dotty project that cross-compiles with Scala 2](https://github.com/lampepfl/dotty-cross.g8)

## Using Dotty in your own project

### project/plugins.sbt
```scala
addSbtPlugin("ch.epfl.lamp" % "sbt-dotty" % "0.1.4")
```

### project/build.properties
```scala
sbt.version=0.13.15
```

Older versions of sbt are not supported.


### build.sbt
Any version number that starts with `0.` is automatically recognized as Dotty by
the `sbt-dotty` plugin, you don't need to set up anything:

```scala
scalaVersion := "0.2.0-RC1"
```

New builds of dotty are published nightly, look at the bottom of
https://repo1.maven.org/maven2/ch/epfl/lamp/dotty_0.3/ to find the latest version
number. Alternatively, you can set `scalaVersion := dottyLatestNightlyBuild.get`
to always use the latest nightly build of dotty.

If you want to migrate an existing library, it might be a good idea to start out
with the compatibility mode (note that this mode affects typechecking and thus
may prevent some valid Dotty code from compiling) by adding to `build.sbt`:

```scala
scalacOptions ++= { if (isDotty.value) Seq("-language:Scala2") else Nil }
```

Using the `isDotty` setting ensures that this option will only be set when
compiling with Dotty.

A tool to port code from Scala 2.x to Dotty is currently in development at
https://github.com/scalacenter/scalafix

If your build contains dependencies that have only been published for Scala 2.x,
you may be able to get them to work on Dotty by replacing:

```scala
    libraryDependencies += "a" %% "b" % "c"
```

by:

```scala
    libraryDependencies += ("a" %% "b" % "c").withDottyCompat()
```

This will have no effect when compiling with Scala 2.x, but when compiling
with Dotty this will change the cross-version to a Scala 2.x one. This
works because Dotty is currently retro-compatible with Scala 2.x.

**NOTE**: Dotty's retro-compatibility with Scala 2.x will be dropped before
Dotty is released, you should not rely on it.

## IDE support

Dotty comes built-in with IDE support, to try it out see
http://dotty.epfl.ch/docs/usage/ide-support.html

## Discuss

Feel free to come chat with us on the
[Dotty gitter](http://gitter.im/lampepfl/dotty)!
