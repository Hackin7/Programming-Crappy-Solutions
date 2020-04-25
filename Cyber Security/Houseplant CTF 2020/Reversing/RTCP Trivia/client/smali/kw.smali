.class public final Lkw;
.super Ljava/lang/Object;

# interfaces
.implements Lkg;


# instance fields
.field final a:Lla;


# direct methods
.method public constructor <init>(Lla;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkw;->a:Lla;

    return-void
.end method

.method private static a(Lke;Lke;)Lke;
    .locals 7

    new-instance v0, Lke$a;

    invoke-direct {v0}, Lke$a;-><init>()V

    iget-object v1, p0, Lke;->a:[Ljava/lang/String;

    const/4 v2, 0x0

    array-length v1, v1

    div-int/lit8 v1, v1, 0x2

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {p0, v3}, Lke;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v3}, Lke;->b(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Warning"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "1"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    :cond_0
    invoke-static {v4}, Lkw;->b(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-static {v4}, Lkw;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {p1, v4}, Lke;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    :cond_1
    sget-object v6, Lkt;->a:Lkt;

    invoke-virtual {v6, v0, v4, v5}, Lkt;->a(Lke$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object p0, p1, Lke;->a:[Ljava/lang/String;

    array-length p0, p0

    div-int/lit8 p0, p0, 0x2

    :goto_1
    if-ge v2, p0, :cond_5

    invoke-virtual {p1, v2}, Lke;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkw;->b(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v1}, Lkw;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Lkt;->a:Lkt;

    invoke-virtual {p1, v2}, Lke;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v1, v4}, Lkt;->a(Lke$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Lke$a;->a()Lke;

    move-result-object p0

    return-object p0
.end method

.method private static a(Lkn;)Lkn;
    .locals 1

    if-eqz p0, :cond_0

    iget-object v0, p0, Lkn;->g:Lko;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkn;->a()Lkn$a;

    move-result-object p0

    const/4 v0, 0x0

    iput-object v0, p0, Lkn$a;->g:Lko;

    invoke-virtual {p0}, Lkn$a;->a()Lkn;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Connection"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Keep-Alive"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authenticate"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authorization"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TE"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Trailers"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Transfer-Encoding"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Upgrade"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Content-Length"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Content-Encoding"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Content-Type"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final a(Lkg$a;)Lkn;
    .locals 19

    move-object/from16 v1, p0

    iget-object v2, v1, Lkw;->a:Lla;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v1, Lkw;->a:Lla;

    invoke-interface {v2}, Lla;->a()Lkn;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v6, Lky$a;

    invoke-interface/range {p1 .. p1}, Lkg$a;->a()Lkl;

    move-result-object v7

    invoke-direct {v6, v4, v5, v7, v2}, Lky$a;-><init>(JLkl;Lkn;)V

    iget-object v4, v6, Lky$a;->c:Lkn;

    if-nez v4, :cond_1

    new-instance v4, Lky;

    iget-object v5, v6, Lky$a;->b:Lkl;

    invoke-direct {v4, v5, v3}, Lky;-><init>(Lkl;Lkn;)V

    :goto_1
    move-object v5, v3

    goto/16 :goto_11

    :cond_1
    iget-object v4, v6, Lky$a;->b:Lkl;

    iget-object v4, v4, Lkl;->a:Lkf;

    invoke-virtual {v4}, Lkf;->b()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, v6, Lky$a;->c:Lkn;

    iget-object v4, v4, Lkn;->e:Lkd;

    if-nez v4, :cond_2

    new-instance v4, Lky;

    iget-object v5, v6, Lky$a;->b:Lkl;

    invoke-direct {v4, v5, v3}, Lky;-><init>(Lkl;Lkn;)V

    goto :goto_1

    :cond_2
    iget-object v4, v6, Lky$a;->c:Lkn;

    iget-object v5, v6, Lky$a;->b:Lkl;

    invoke-static {v4, v5}, Lky;->a(Lkn;Lkl;)Z

    move-result v4

    if-nez v4, :cond_3

    new-instance v4, Lky;

    iget-object v5, v6, Lky$a;->b:Lkl;

    invoke-direct {v4, v5, v3}, Lky;-><init>(Lkl;Lkn;)V

    goto :goto_1

    :cond_3
    iget-object v4, v6, Lky$a;->b:Lkl;

    invoke-virtual {v4}, Lkl;->b()Ljr;

    move-result-object v4

    iget-boolean v5, v4, Ljr;->c:Z

    if-nez v5, :cond_1c

    iget-object v5, v6, Lky$a;->b:Lkl;

    const-string v7, "If-Modified-Since"

    invoke-virtual {v5, v7}, Lkl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_5

    const-string v7, "If-None-Match"

    invoke-virtual {v5, v7}, Lkl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v5, 0x1

    :goto_3
    if-eqz v5, :cond_6

    goto/16 :goto_10

    :cond_6
    iget-object v5, v6, Lky$a;->c:Lkn;

    invoke-virtual {v5}, Lkn;->b()Ljr;

    move-result-object v5

    iget-boolean v7, v5, Ljr;->l:Z

    if-eqz v7, :cond_7

    new-instance v4, Lky;

    iget-object v5, v6, Lky$a;->c:Lkn;

    invoke-direct {v4, v3, v5}, Lky;-><init>(Lkl;Lkn;)V

    goto :goto_1

    :cond_7
    iget-object v7, v6, Lky$a;->d:Ljava/util/Date;

    const-wide/16 v10, 0x0

    if-eqz v7, :cond_8

    iget-wide v12, v6, Lky$a;->j:J

    iget-object v7, v6, Lky$a;->d:Ljava/util/Date;

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    sub-long/2addr v12, v14

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    goto :goto_4

    :cond_8
    move-wide v12, v10

    :goto_4
    iget v7, v6, Lky$a;->l:I

    const/4 v14, -0x1

    if-eq v7, v14, :cond_9

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget v15, v6, Lky$a;->l:I

    int-to-long v8, v15

    invoke-virtual {v7, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    invoke-static {v12, v13, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    :cond_9
    iget-wide v7, v6, Lky$a;->j:J

    move-object/from16 v17, v4

    iget-wide v3, v6, Lky$a;->i:J

    sub-long/2addr v7, v3

    iget-wide v3, v6, Lky$a;->a:J

    iget-wide v10, v6, Lky$a;->j:J

    sub-long/2addr v3, v10

    add-long/2addr v12, v7

    add-long/2addr v12, v3

    iget-object v3, v6, Lky$a;->c:Lkn;

    invoke-virtual {v3}, Lkn;->b()Ljr;

    move-result-object v3

    iget v4, v3, Ljr;->e:I

    if-eq v4, v14, :cond_a

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget v3, v3, Ljr;->e:I

    int-to-long v7, v3

    invoke-virtual {v4, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v10

    :goto_5
    move-wide v7, v10

    move-object/from16 v3, v17

    :goto_6
    const-wide/16 v10, 0x0

    goto/16 :goto_b

    :cond_a
    iget-object v3, v6, Lky$a;->h:Ljava/util/Date;

    if-eqz v3, :cond_d

    iget-object v3, v6, Lky$a;->d:Ljava/util/Date;

    if-eqz v3, :cond_b

    iget-object v3, v6, Lky$a;->d:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    goto :goto_7

    :cond_b
    iget-wide v3, v6, Lky$a;->j:J

    :goto_7
    iget-object v7, v6, Lky$a;->h:Ljava/util/Date;

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    sub-long v10, v7, v3

    const-wide/16 v3, 0x0

    cmp-long v7, v10, v3

    if-lez v7, :cond_c

    goto :goto_5

    :cond_c
    move-object/from16 v3, v17

    const-wide/16 v7, 0x0

    goto :goto_6

    :cond_d
    iget-object v3, v6, Lky$a;->f:Ljava/util/Date;

    if-eqz v3, :cond_10

    iget-object v3, v6, Lky$a;->c:Lkn;

    iget-object v3, v3, Lkn;->a:Lkl;

    iget-object v3, v3, Lkl;->a:Lkf;

    iget-object v4, v3, Lkf;->d:Ljava/util/List;

    if-nez v4, :cond_e

    const/4 v3, 0x0

    goto :goto_8

    :cond_e
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v3, Lkf;->d:Ljava/util/List;

    invoke-static {v4, v3}, Lkf;->b(Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_8
    if-nez v3, :cond_10

    iget-object v3, v6, Lky$a;->d:Ljava/util/Date;

    if-eqz v3, :cond_f

    iget-object v3, v6, Lky$a;->d:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    goto :goto_9

    :cond_f
    iget-wide v3, v6, Lky$a;->i:J

    :goto_9
    iget-object v7, v6, Lky$a;->f:Ljava/util/Date;

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    sub-long/2addr v3, v7

    const-wide/16 v10, 0x0

    cmp-long v7, v3, v10

    if-lez v7, :cond_11

    const-wide/16 v7, 0xa

    div-long/2addr v3, v7

    move-wide v7, v3

    goto :goto_a

    :cond_10
    const-wide/16 v10, 0x0

    :cond_11
    move-wide v7, v10

    :goto_a
    move-object/from16 v3, v17

    :goto_b
    iget v4, v3, Ljr;->e:I

    if-eq v4, v14, :cond_12

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget v9, v3, Ljr;->e:I

    int-to-long v10, v9

    invoke-virtual {v4, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    :cond_12
    iget v4, v3, Ljr;->j:I

    if-eq v4, v14, :cond_13

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget v9, v3, Ljr;->j:I

    int-to-long v9, v9

    invoke-virtual {v4, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v10

    goto :goto_c

    :cond_13
    const-wide/16 v10, 0x0

    :goto_c
    iget-boolean v4, v5, Ljr;->h:Z

    if-nez v4, :cond_14

    iget v4, v3, Ljr;->i:I

    if-eq v4, v14, :cond_14

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget v3, v3, Ljr;->i:I

    int-to-long v14, v3

    invoke-virtual {v4, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    goto :goto_d

    :cond_14
    const-wide/16 v3, 0x0

    :goto_d
    iget-boolean v5, v5, Ljr;->c:Z

    if-nez v5, :cond_18

    add-long/2addr v10, v12

    add-long/2addr v3, v7

    cmp-long v3, v10, v3

    if-gez v3, :cond_18

    iget-object v3, v6, Lky$a;->c:Lkn;

    invoke-virtual {v3}, Lkn;->a()Lkn$a;

    move-result-object v3

    cmp-long v4, v10, v7

    if-ltz v4, :cond_15

    const-string v4, "Warning"

    const-string v5, "110 HttpURLConnection \"Response is stale\""

    invoke-virtual {v3, v4, v5}, Lkn$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkn$a;

    :cond_15
    const-wide/32 v4, 0x5265c00

    cmp-long v4, v12, v4

    if-lez v4, :cond_17

    iget-object v4, v6, Lky$a;->c:Lkn;

    invoke-virtual {v4}, Lkn;->b()Ljr;

    move-result-object v4

    iget v4, v4, Ljr;->e:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_16

    iget-object v4, v6, Lky$a;->h:Ljava/util/Date;

    if-nez v4, :cond_16

    const/16 v16, 0x1

    goto :goto_e

    :cond_16
    const/16 v16, 0x0

    :goto_e
    if-eqz v16, :cond_17

    const-string v4, "Warning"

    const-string v5, "113 HttpURLConnection \"Heuristic expiration\""

    invoke-virtual {v3, v4, v5}, Lkn$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkn$a;

    :cond_17
    new-instance v4, Lky;

    invoke-virtual {v3}, Lkn$a;->a()Lkn;

    move-result-object v3

    const/4 v5, 0x0

    invoke-direct {v4, v5, v3}, Lky;-><init>(Lkl;Lkn;)V

    goto :goto_11

    :cond_18
    iget-object v3, v6, Lky$a;->k:Ljava/lang/String;

    if-eqz v3, :cond_19

    const-string v3, "If-None-Match"

    iget-object v4, v6, Lky$a;->k:Ljava/lang/String;

    goto :goto_f

    :cond_19
    iget-object v3, v6, Lky$a;->f:Ljava/util/Date;

    if-eqz v3, :cond_1a

    const-string v3, "If-Modified-Since"

    iget-object v4, v6, Lky$a;->g:Ljava/lang/String;

    goto :goto_f

    :cond_1a
    iget-object v3, v6, Lky$a;->d:Ljava/util/Date;

    if-eqz v3, :cond_1b

    const-string v3, "If-Modified-Since"

    iget-object v4, v6, Lky$a;->e:Ljava/lang/String;

    :goto_f
    iget-object v5, v6, Lky$a;->b:Lkl;

    iget-object v5, v5, Lkl;->c:Lke;

    invoke-virtual {v5}, Lke;->a()Lke$a;

    move-result-object v5

    sget-object v7, Lkt;->a:Lkt;

    invoke-virtual {v7, v5, v3, v4}, Lkt;->a(Lke$a;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v6, Lky$a;->b:Lkl;

    invoke-virtual {v3}, Lkl;->a()Lkl$a;

    move-result-object v3

    invoke-virtual {v5}, Lke$a;->a()Lke;

    move-result-object v4

    invoke-virtual {v4}, Lke;->a()Lke$a;

    move-result-object v4

    iput-object v4, v3, Lkl$a;->c:Lke$a;

    invoke-virtual {v3}, Lkl$a;->a()Lkl;

    move-result-object v3

    new-instance v4, Lky;

    iget-object v5, v6, Lky$a;->c:Lkn;

    invoke-direct {v4, v3, v5}, Lky;-><init>(Lkl;Lkn;)V

    const/4 v5, 0x0

    goto :goto_11

    :cond_1b
    new-instance v4, Lky;

    iget-object v3, v6, Lky$a;->b:Lkl;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5}, Lky;-><init>(Lkl;Lkn;)V

    goto :goto_11

    :cond_1c
    :goto_10
    move-object v5, v3

    new-instance v4, Lky;

    iget-object v3, v6, Lky$a;->b:Lkl;

    invoke-direct {v4, v3, v5}, Lky;-><init>(Lkl;Lkn;)V

    :goto_11
    iget-object v3, v4, Lky;->a:Lkl;

    if-eqz v3, :cond_1d

    iget-object v3, v6, Lky$a;->b:Lkl;

    invoke-virtual {v3}, Lkl;->b()Ljr;

    move-result-object v3

    iget-boolean v3, v3, Ljr;->k:Z

    if-eqz v3, :cond_1d

    new-instance v4, Lky;

    invoke-direct {v4, v5, v5}, Lky;-><init>(Lkl;Lkn;)V

    :cond_1d
    iget-object v3, v4, Lky;->a:Lkl;

    iget-object v4, v4, Lky;->b:Lkn;

    if-eqz v2, :cond_1e

    if-nez v4, :cond_1e

    iget-object v5, v2, Lkn;->g:Lko;

    invoke-static {v5}, Lkv;->a(Ljava/io/Closeable;)V

    :cond_1e
    if-nez v3, :cond_1f

    if-nez v4, :cond_1f

    new-instance v2, Lkn$a;

    invoke-direct {v2}, Lkn$a;-><init>()V

    invoke-interface/range {p1 .. p1}, Lkg$a;->a()Lkl;

    move-result-object v3

    iput-object v3, v2, Lkn$a;->a:Lkl;

    sget-object v3, Lkj;->b:Lkj;

    iput-object v3, v2, Lkn$a;->b:Lkj;

    const/16 v3, 0x1f8

    iput v3, v2, Lkn$a;->c:I

    const-string v3, "Unsatisfiable Request (only-if-cached)"

    iput-object v3, v2, Lkn$a;->d:Ljava/lang/String;

    sget-object v3, Lkv;->c:Lko;

    iput-object v3, v2, Lkn$a;->g:Lko;

    const-wide/16 v3, -0x1

    iput-wide v3, v2, Lkn$a;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Lkn$a;->l:J

    invoke-virtual {v2}, Lkn$a;->a()Lkn;

    move-result-object v2

    return-object v2

    :cond_1f
    if-nez v3, :cond_20

    invoke-virtual {v4}, Lkn;->a()Lkn$a;

    move-result-object v2

    invoke-static {v4}, Lkw;->a(Lkn;)Lkn;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkn$a;->b(Lkn;)Lkn$a;

    move-result-object v2

    invoke-virtual {v2}, Lkn$a;->a()Lkn;

    move-result-object v2

    return-object v2

    :cond_20
    move-object/from16 v5, p1

    :try_start_0
    invoke-interface {v5, v3}, Lkg$a;->a(Lkl;)Lkn;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_21

    if-eqz v2, :cond_21

    iget-object v2, v2, Lkn;->g:Lko;

    invoke-static {v2}, Lkv;->a(Ljava/io/Closeable;)V

    :cond_21
    if-eqz v4, :cond_23

    iget v2, v5, Lkn;->c:I

    const/16 v6, 0x130

    if-ne v2, v6, :cond_22

    invoke-virtual {v4}, Lkn;->a()Lkn$a;

    move-result-object v2

    iget-object v3, v4, Lkn;->f:Lke;

    iget-object v6, v5, Lkn;->f:Lke;

    invoke-static {v3, v6}, Lkw;->a(Lke;Lke;)Lke;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkn$a;->a(Lke;)Lkn$a;

    move-result-object v2

    iget-wide v6, v5, Lkn;->k:J

    iput-wide v6, v2, Lkn$a;->k:J

    iget-wide v6, v5, Lkn;->l:J

    iput-wide v6, v2, Lkn$a;->l:J

    invoke-static {v4}, Lkw;->a(Lkn;)Lkn;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkn$a;->b(Lkn;)Lkn$a;

    move-result-object v2

    invoke-static {v5}, Lkw;->a(Lkn;)Lkn;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkn$a;->a(Lkn;)Lkn$a;

    move-result-object v2

    invoke-virtual {v2}, Lkn$a;->a()Lkn;

    move-result-object v2

    iget-object v3, v5, Lkn;->g:Lko;

    invoke-virtual {v3}, Lko;->close()V

    return-object v2

    :cond_22
    iget-object v2, v4, Lkn;->g:Lko;

    invoke-static {v2}, Lkv;->a(Ljava/io/Closeable;)V

    :cond_23
    invoke-virtual {v5}, Lkn;->a()Lkn$a;

    move-result-object v2

    invoke-static {v4}, Lkw;->a(Lkn;)Lkn;

    move-result-object v4

    invoke-virtual {v2, v4}, Lkn$a;->b(Lkn;)Lkn$a;

    move-result-object v2

    invoke-static {v5}, Lkw;->a(Lkn;)Lkn;

    move-result-object v4

    invoke-virtual {v2, v4}, Lkn$a;->a(Lkn;)Lkn$a;

    move-result-object v2

    invoke-virtual {v2}, Lkn$a;->a()Lkn;

    move-result-object v2

    iget-object v4, v1, Lkw;->a:Lla;

    if-eqz v4, :cond_27

    invoke-static {v2}, Llm;->b(Lkn;)Z

    move-result v4

    if-eqz v4, :cond_26

    invoke-static {v2, v3}, Lky;->a(Lkn;Lkl;)Z

    move-result v4

    if-eqz v4, :cond_26

    iget-object v3, v1, Lkw;->a:Lla;

    invoke-interface {v3}, Lla;->b()Lkx;

    move-result-object v3

    if-nez v3, :cond_24

    return-object v2

    :cond_24
    invoke-interface {v3}, Lkx;->a()Lnr;

    move-result-object v4

    if-nez v4, :cond_25

    return-object v2

    :cond_25
    iget-object v5, v2, Lkn;->g:Lko;

    invoke-virtual {v5}, Lko;->b()Lne;

    move-result-object v5

    invoke-static {v4}, Lnl;->a(Lnr;)Lnd;

    move-result-object v4

    new-instance v6, Lkw$1;

    invoke-direct {v6, v1, v5, v3, v4}, Lkw$1;-><init>(Lkw;Lne;Lkx;Lnd;)V

    const-string v3, "Content-Type"

    invoke-virtual {v2, v3}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v2, Lkn;->g:Lko;

    invoke-virtual {v4}, Lko;->a()J

    move-result-wide v4

    invoke-virtual {v2}, Lkn;->a()Lkn$a;

    move-result-object v2

    new-instance v7, Llp;

    invoke-static {v6}, Lnl;->a(Lns;)Lne;

    move-result-object v6

    invoke-direct {v7, v3, v4, v5, v6}, Llp;-><init>(Ljava/lang/String;JLne;)V

    iput-object v7, v2, Lkn$a;->g:Lko;

    invoke-virtual {v2}, Lkn$a;->a()Lkn;

    move-result-object v2

    return-object v2

    :cond_26
    iget-object v3, v3, Lkl;->b:Ljava/lang/String;

    const-string v4, "POST"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_27

    const-string v4, "PATCH"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_27

    const-string v4, "PUT"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_27

    const-string v4, "DELETE"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_27

    const-string v4, "MOVE"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    :cond_27
    return-object v2

    :catchall_0
    move-exception v0

    if-eqz v2, :cond_28

    iget-object v2, v2, Lkn;->g:Lko;

    invoke-static {v2}, Lkv;->a(Ljava/io/Closeable;)V

    :cond_28
    throw v0
.end method
