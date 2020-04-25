.class final Lmb$b$1;
.super Lmb$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lmb$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmd;)V
    .locals 1

    sget-object v0, Llw;->e:Llw;

    invoke-virtual {p1, v0}, Lmd;->a(Llw;)V

    return-void
.end method
