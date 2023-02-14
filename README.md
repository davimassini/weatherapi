
![WeatherAPI - Logo](https://i.imgur.com/6C0kDoF.gif)
# 🌦️ WeatherAPI[](#-weatherapi-)
First of all, that project is a huge over-engineering and the purpose of this is to be a showcase. If you're interested in an open-source weather API for your game or something like that, and ocasionally dropped here, keep searching.

The history behind this: I was going to the gym when I walked through my friend who was watching some Tarkov video and said about the feature in the game which makes rain when Tarkov's rain in real life. My first reaction was to say that it didn't seem like a difficult system to implement and that it would be a nice personal challenge to do something like that. So I did it.

WeatherAPI uses [WeatherAPI](https://www.weatherapi.com/) - yeah, look how creative I'm at creating names 😆 - to get the real statics of the world. For personal projects, the standard version is more than enough.

Don't forget to check the [acknowledgments](#acknowledgments).

## ⚙️ Run it[](#-run-it)

No big deal. Just be sure you had all the [requirements](#requirements), then run the task **:bootRun** in Gradle.

## 📑 Requirements[](#-requirements)

- Some Java IDE.
- Your own [WeatherAPI](https://www.weatherapi.com/) token.
- At least Java 17 installed on your machine. (Always recommend the zulu edition)

## 📖 API Docs[](#-api-docs)

#### Returns the weather of the specified city.

```http
  GET /weather
```

| Parâmetro   | Tipo       | Descrição                                        |
| :---------- | :--------- | :----------------------------------------------- |
| `city`      | `string`   | The name of the city you want to get the weather.|
| `apiKey`    | `string`   | Your own API Key.                                |


## 👾 Demo[](#-demo)

![](https://i.imgur.com/H3D6Wre.gif)

You can also test this [here](#).

## 📈 Improvements[](#-improvements)

- [x] Hour;
- [x] Rain;
- [x] Wind;
- [x] Fog;
- [x] Lightning;
- [ ] Snow;
- [ ] Better day/night system;
- [ ] Sunny light;

## 🗺️ Acknowledgments[](#-acknowledgments)

- NASA's Goddard Space Flight Center - [Goddard Media Studios](https://svs.gsfc.nasa.gov/12532)
- Weather System used in Demo - [Pixel Weather Particles](https://assetstore.unity.com/packages/vfx/particles/environment/pixel-weather-particles-148577)
- [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
- [Awesome README](https://github.com/matiassingers/awesome-readme)
- [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)

## 💖 More than words[](#-more-than-words)

If you like my work and want to support me, you can [buy me a coffee ☕](https://www.buymeacoffee.com/davimassini). Also, you can follow me on social networks:
- [the bird one 🐦](https://twitter.com/MassiniDavi);
- [the one for pics 🤳](https://instagram.com/davimassini);

