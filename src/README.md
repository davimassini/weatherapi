
![WeatherAPI - Logo](https://previews.dropbox.com/p/thumb/ABxKXGWc808EaSmnYzX1zAt-t4iQykYve3DNhIpdoYw--QGXho1s9J6ZiKArkJJbCcrueVq0mjQ-DVWnbpR4dMJ7HJ0TBTy5i6DEOqO4NyM-BM9kPQmONbVxCls5jkyNza1Q7oBjMQEJfGjiYSHGTGLmkWI5c18xEGFXMK7IpKzHWsw1zAQc4a6n-mQrn5dW_YoRPttzsBhib41fYIATuefRQ__ZulVANk8-VeQExYjbRNIv-hRJxuLWf7ArLK96OTLPKEbRyBu06meA35AQjQCoV8ShhLryVoYwL6M4wJMA6nTsXeexj1cK45EuA95LXBp8qx_3GrXctNz1iiEc4bfxgJWE_pev0qHiM-O7wcp8gglSouLnJnBmF25e-pldVHB19uiQXuaLp9ouk6VWfU491IxBUMasew-bs_Bx5dnrzzezmPinCUQQm4MD8u0dGwg/p.gif)
# 🌦️ WeatherAPI [](#about)
First of all, that project is a huge overengineering and the purpose of this is to be a showcase. If you're interested in an open-source weather API for your game or something like that, and ocasionally dropped here, keep searching.

The history behind this: I was going to the gym when I walked through my friend who was watching some Tarkov video and said about the feature in the game which makes rain when Tarkov's rain in real life. My first reaction was to say that it didn't seem like a difficult system to implement and that it would be a nice personal challenge to do something like that. So I did it.

WeatherAPI uses [WeatherAPI](https://www.weatherapi.com/) - yeah, look how creative I'm at creating names 😆 - to get the real statics of the world. For personal projects, the standard version is more than enough.

Don't forget to check the [acknowledgments](#acknowledgments).

## ⚙️ Run it [](#runit)

No big deal. Just be sure you had all of the [requirements](#requirements), then run the task **:bootRun** in Gradle.

## 📑 Requirements [](#requirements)

- Some Java IDE.
- Your own [WeatherAPI](https://www.weatherapi.com/) token.
- At least Java 17 installed on your machine. (Always recommend the zulu edition)

## 📖 API Docs [](#docs)

#### Returns the weather of the specified city.

```http
  GET /weather
```

| Parâmetro   | Tipo       | Descrição                                        |
| :---------- | :--------- | :----------------------------------------------- |
| `city`      | `string`   | The name of the city you want to get the weather.|
| `apiKey`    | `string`   | Your own API Key.                                |


## 👾 Demo [](#demo)

![](https://previews.dropbox.com/p/thumb/ABwzHlzwUygP6UBu-KFF7K9LReGRjMbEqxUl6SAon0axYCCyojkY4rJg-MxL5Vq6pz5WGwsIMQ88PLOWw-uxoYyjG5WkU6QDyyPwOgXuI0kGwRWpj_oNbNzCKcMY9i-WylbHQ8fBkEk6OB3MDjoxfSYbnEGgLbWWUTsKXxrrSoTPPBaY5V9cHxtVLKqD64QFxRtWuZE1wHcYhQtzq5U3A-EKP0_5hx9dNcOE6SG5koRBiy9fB2323e-ubDslA38Q5Lz0FU3OWBzyO30k9NoVXo5_GBNreh9Xid_HF9yk9UVlzR-wDhYMkAtFxVotm0pStXaw0WMoIf86TWfbK8a1RdeR6mXxo_fhqzyEbzSNhC1n9j01yMoI01AB-I3Frn5NlakwgAv6swTCzg7xeQbo1KgYkwHjPi73jnkZzemY0s7_bfdBu1_NbaOnjpiVWQhLRF0hA9rSsxBhuVtRKNH1Z5F1ntvExZNcXYTn-SZxk36-biHrckkNB-tqBtTlOr1QNsM/p.gif)

You can also test this here.

## 📈 Improvements [](#improvements)

- [x] Hour;
- [x] Rain;
- [x] Wind;
- [x] Fog;
- [x] Lightning;
- [ ] Snow;
- [ ] Better day/night system;
- [ ] Sunny light;

## 🗺️ Acknowledgments [](#acknowledgments)

- NASA's Goddard Space Flight Center - [Goddard Media Studios](https://svs.gsfc.nasa.gov/12532)
- Weather System used in Demo - [Pixel Weather Particles](https://assetstore.unity.com/packages/vfx/particles/environment/pixel-weather-particles-148577)
- [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
- [Awesome README](https://github.com/matiassingers/awesome-readme)
- [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)

## 💖 More than words [](#support)

If you like my work and want to support me, you can [buy me a coffee ☕](https://www.buymeacoffee.com/davimassini). Also, you can follow me on social networks:
- [the bird one 🐦](https://twitter.com/MassiniDavi);
- [the one for pics 🤳](https://instagram.com/davimassini);

