# Setup

### Installation

- Java 17 & Scala 3 (can be installed via sdkman or coursier)
- Node & npm (can be installed via nvm)

Then run the following commands to install and confirm your environment works 
```
cd resume
npm install
sbt compile
```

### Dev iterations

In two different terminals
```
cd resume
sbt ~fastLinkJS
npm run dev
```

### Build output for production

```
cd resume
sbt fastLinkJS
npm run build
```

# References

- [Laminar doc](https://laminar.dev/documentation)
