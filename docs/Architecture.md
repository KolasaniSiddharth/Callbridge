# Architecture

CallBridge follows a modular architecture.

## Main Modules

- UI
- Service
- Receiver
- Repository
- Providers
- Preferences
- Notifications

## Call Flow

Incoming Call

↓

PhoneStateReceiver

↓

CallMonitorService

↓

CallRepository

↓

Telegram

Wi-Fi

WebSocket

↓

Desktop Notification

↓

UI Update