.class final Lm;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm$a;
    }
.end annotation


# static fields
.field static a:Lm;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/location/LocationManager;

.field private final d:Lm$a;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm$a;

    invoke-direct {v0}, Lm$a;-><init>()V

    iput-object v0, p0, Lm;->d:Lm$a;

    iput-object p1, p0, Lm;->b:Landroid/content/Context;

    iput-object p2, p0, Lm;->c:Landroid/location/LocationManager;

    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/location/Location;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lm;->c:Landroid/location/LocationManager;

    invoke-virtual {v0, p1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm;->c:Landroid/location/LocationManager;

    invoke-virtual {v0, p1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "TwilightManager"

    const-string v1, "Failed to get last known location"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method final a()Z
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lm;->d:Lm$a;

    iget-object v2, v0, Lm;->d:Lm$a;

    iget-wide v2, v2, Lm$a;->f:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-lez v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-eqz v2, :cond_1

    iget-boolean v1, v1, Lm$a;->a:Z

    return v1

    :cond_1
    iget-object v2, v0, Lm;->b:Landroid/content/Context;

    const-string v5, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v2, v5}, Lew;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    const/4 v5, 0x0

    if-nez v2, :cond_2

    const-string v2, "network"

    invoke-direct {v0, v2}, Lm;->a(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v5

    :goto_1
    iget-object v6, v0, Lm;->b:Landroid/content/Context;

    const-string v7, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v6, v7}, Lew;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    if-nez v6, :cond_3

    const-string v5, "gps"

    invoke-direct {v0, v5}, Lm;->a(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v5

    :cond_3
    if-eqz v5, :cond_4

    if-eqz v2, :cond_4

    invoke-virtual {v5}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    invoke-virtual {v2}, Landroid/location/Location;->getTime()J

    move-result-wide v8

    cmp-long v6, v6, v8

    if-lez v6, :cond_5

    goto :goto_2

    :cond_4
    if-eqz v5, :cond_5

    :goto_2
    move-object v2, v5

    :cond_5
    if-eqz v2, :cond_c

    iget-object v5, v0, Lm;->d:Lm$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    sget-object v6, Ll;->a:Ll;

    if-nez v6, :cond_6

    new-instance v6, Ll;

    invoke-direct {v6}, Ll;-><init>()V

    sput-object v6, Ll;->a:Ll;

    :cond_6
    sget-object v11, Ll;->a:Ll;

    const-wide/32 v22, 0x5265c00

    sub-long v16, v13, v22

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v18

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v20

    move-object v15, v11

    invoke-virtual/range {v15 .. v21}, Ll;->a(JDD)V

    iget-wide v9, v11, Ll;->b:J

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v15

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v17

    move-object v6, v11

    move-wide v7, v13

    move-wide/from16 v24, v9

    move-wide v9, v15

    move-object v15, v11

    move-wide/from16 v11, v17

    invoke-virtual/range {v6 .. v12}, Ll;->a(JDD)V

    iget v6, v15, Ll;->d:I

    if-ne v6, v4, :cond_7

    move v3, v4

    :cond_7
    iget-wide v6, v15, Ll;->c:J

    iget-wide v8, v15, Ll;->b:J

    add-long v16, v13, v22

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v18

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v20

    move-object v2, v15

    invoke-virtual/range {v15 .. v21}, Ll;->a(JDD)V

    iget-wide v10, v2, Ll;->c:J

    const-wide/16 v15, -0x1

    cmp-long v2, v6, v15

    if-eqz v2, :cond_b

    cmp-long v2, v8, v15

    if-nez v2, :cond_8

    goto :goto_4

    :cond_8
    cmp-long v2, v13, v8

    const-wide/16 v15, 0x0

    if-lez v2, :cond_9

    add-long/2addr v15, v10

    goto :goto_3

    :cond_9
    cmp-long v2, v13, v6

    if-lez v2, :cond_a

    add-long/2addr v15, v8

    goto :goto_3

    :cond_a
    add-long/2addr v15, v6

    :goto_3
    const-wide/32 v12, 0xea60

    add-long/2addr v15, v12

    goto :goto_5

    :cond_b
    :goto_4
    const-wide/32 v15, 0x2932e00

    add-long/2addr v15, v13

    :goto_5
    move-wide v12, v15

    iput-boolean v3, v5, Lm$a;->a:Z

    move-wide/from16 v2, v24

    iput-wide v2, v5, Lm$a;->b:J

    iput-wide v6, v5, Lm$a;->c:J

    iput-wide v8, v5, Lm$a;->d:J

    iput-wide v10, v5, Lm$a;->e:J

    iput-wide v12, v5, Lm$a;->f:J

    iget-boolean v1, v1, Lm$a;->a:Z

    return v1

    :cond_c
    const-string v1, "TwilightManager"

    const-string v2, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x6

    if-lt v1, v2, :cond_e

    const/16 v2, 0x16

    if-lt v1, v2, :cond_d

    return v4

    :cond_d
    return v3

    :cond_e
    return v4
.end method
