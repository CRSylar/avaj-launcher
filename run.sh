#!/bin/bash
cd src/
javac launcher/Simulator/Simulator.java

if [[ "$#" -eq 0 ]]
then
  echo "No Args supplied"
  java launcher.Simulator.Simulator
else
  java launcher.Simulator.Simulator $1
fi