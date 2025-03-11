config.devServer = {
    ...config.devServer,
    historyApiFallback: true, // Redirige les 404 vers index.html
    open: true, // Ouvre automatiquement le navigateur au démarrage
    hot: true, // Active le rechargement à chaud
};