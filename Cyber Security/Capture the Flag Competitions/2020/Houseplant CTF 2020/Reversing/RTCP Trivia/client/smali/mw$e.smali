.class public abstract Lmw$e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation


# instance fields
.field public final c:Z

.field public final d:Lne;

.field public final e:Lnd;


# direct methods
.method public constructor <init>(Lne;Lnd;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lmw$e;->c:Z

    iput-object p1, p0, Lmw$e;->d:Lne;

    iput-object p2, p0, Lmw$e;->e:Lnd;

    return-void
.end method
