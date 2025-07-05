import { defineConfig } from "vite";
import scalaJSPlugin from "@scala-js/vite-plugin-scalajs";

export default defineConfig({
  plugins: [scalaJSPlugin()],
  build: {
    outDir: '..',
    cssCodeSplit: false,  // false = Load all CSS upfront
    minify: "terser",
    sourcemap: true,  // Enable source maps for easier debugging
  },
  // Optional: Silence Sass deprecation warnings
  css: {
    preprocessorOptions: {
      scss: {
        silenceDeprecations: [
          'import',
          'mixed-decls',
          'color-functions',
          'global-builtin',
        ],
      },
    },
  },
});
