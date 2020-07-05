.class public final Lmb$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/net/Socket;

.field public b:Ljava/lang/String;

.field public c:Lne;

.field public d:Lnd;

.field public e:Lmb$b;

.field f:Lmg;

.field g:Z

.field public h:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lmb$b;->m:Lmb$b;

    iput-object v0, p0, Lmb$a;->e:Lmb$b;

    sget-object v0, Lmg;->a:Lmg;

    iput-object v0, p0, Lmb$a;->f:Lmg;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lmb$a;->g:Z

    return-void
.end method
