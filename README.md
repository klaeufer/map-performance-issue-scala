# Overview

For Scala's immutable maps

    m + (p, q)

appears to be three orders of magnitude slower than the functionally equivalent

    m + p + q

This applies to versions 2.10.6 and 2.11.7.

# Usage

To run the benchmark:

    $ sbt test:run

Typical results:

    ::Benchmark +(single arg)::
    cores: 4
    hostname: illimani
    name: Java HotSpot(TM) 64-Bit Server VM
    osArch: x86_64
    osName: Mac OS X
    vendor: Oracle Corporation
    version: 25.65-b01
    Parameters(size -> 10): 0.006857
    Parameters(size -> 100): 0.021678
    Parameters(size -> 1000): 0.32387


    ::Benchmark +(two args)::
    cores: 4
    hostname: illimani
    name: Java HotSpot(TM) 64-Bit Server VM
    osArch: x86_64
    osName: Mac OS X
    vendor: Oracle Corporation
    version: 25.65-b01
    Parameters(size -> 10): 0.01178
    Parameters(size -> 100): 1.018091
    Parameters(size -> 1000): 189.006387
