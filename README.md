# The redis to iso with j8583Reactive as server

## How to Build

```
mvn clean package
```

## Notes

This non-blocking netty is really fast. Tested in Acer Nitro-5, this library can easily give 3000TPS.
But, please be aware that j8583 doesn't support LLLLLLBIN at the time of writing these codes.
