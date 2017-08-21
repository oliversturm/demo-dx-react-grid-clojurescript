### Requirements

* The [Node](https://nodejs.org/) environment
* An installation of [Leiningen](https://leiningen.org/#install)

### Setting up

To build the JavaScript bundle that contains React as well as the DevExtreme React libraries used by the demo, run these commands:

```
npm install
npm run build
```

### Development mode

To start the Figwheel compiler, navigate to the project folder and run the following command in the terminal:

```
lein figwheel
```

Figwheel will automatically push cljs changes to the browser.
Once Figwheel starts up, it should open the start page of the demo in a browser automatically. Alternatively you can manually open the `public/index.html` page.


### Building for production

```
lein clean
lein package
```
